*** Settings ***
Library         SeleniumLibrary
Resource        ./checkpoint2.resource

*** Test Case ***
Processo de compra de uma peca de roupa masculina, feminina ou infantil
    Acessar a loja
    Selecionar categoria
    Selecionar produto
    Selecionar um tamanho e compraAdicionar ao carrinho de compras
    Login
    Preencher dados do cartão de crédito, clicar em "Save and Continue"
    Checar informacoes e clicar em "place order"
    Uma mensagem "Bogus Gateway: Forced failure" deve aparecer, encerrando o processo
    