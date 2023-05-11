package service;

import model.Viagem;

public class FacadeTurismoImpl implements IFacadeTurismo{

    private HotelApi hotelApi;
    private VooApi vooApi;

    public FacadeTurismoImpl () {
        this.hotelApi = new HotelApi();
        this.vooApi = new VooApi();
    }

    @Override
    public Viagem buscar(Viagem viagem) {
        viagem.setLinhaAerea(vooApi.buscarVoos(viagem.getDataPartida(), viagem.getDataRetorno(), viagem.getOrigem(), viagem.getDestino()));
        viagem.setHotel(hotelApi.buscarHoteis(viagem.getDataPartida(), viagem.getDataRetorno(), viagem.getDestino()));
        return viagem;
    }
}
