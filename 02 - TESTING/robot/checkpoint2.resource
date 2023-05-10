*** Variables ***
${SITE}             https://demo.spreecommerce.org
${NAVEGADOR}        Chrome

${CATEGORIA}        class="homepage-hpb"

${PRODUTO}          class="product-component-name"

${TAMANHO}          class="m-1 select-label"
${ADDCARRINHO}      id="add-to-cart-button"

${ENDEMAIL}         id="spree_user_email"
${EMAIL}            bruno.barreto@eletromidia.com.bruno
${ENDSENHA}         id="spree_user_password"
${SENHA}            agoraVai10vez

${CARRINHO}         id="link-to-cart"
${COMPRAR}          id="checkout-link"
${CAMPONOME}        id="bfirstname"
${NOME}             Bruno
${CAMPOSOBRENOME}   id="blastname"
${SOBRENOME}        Barreto
${CAMPOENDERECO}    id="order_bill_address_attributes_address1"
${ENDERECO}         Rua Fulana de tal
${CAMPOCEP}         id="bzipcode"
${CEP}              03677180
${SALVAR}            class="btn btn-primary text-uppercase font-weight-bold w-100 checkout-content-save-continue-button"



*** Keywords ***
Acessar a loja  
    Open Browser            ${SITE}             ${NAVEGADOR}
    Maximize Brawser Window


Selecionar categoria
    Click Element           ${CATEGORIA} 

Selecionar produto    
    Click Element           ${PRODUTO}

Selecionar um tamanho e compraAdicionar ao carrinho de compras
    Click Element           ${TAMANHO} 
    Click Element           ${ADDCARRINHO} 

Login
    Imput Text              ${ENDEMAIL}         ${EMAIL}  
    Imput Text              ${ENDSENHA}         ${SENHA}

Preencher dados do cartão de crédito, clicar em "Save and Continue"
    Click Element           ${CARRINHO}
    Click Element           ${COMPRAR}

    Imput Text              ${CAMPONOME}        ${NOME}
    Imput Text              ${CAMPOSOBRENOME}   ${SOBRENOME}
    Imput Text              ${CAMPOENDERECO}    ${ENDERECO}
    Imput Text              ${CAMPOCEP}         ${CEP}

    Click Element           ${SALVAR}


