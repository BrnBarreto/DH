import { generateText } = require('../util.js');

test ("Salida de Nombres Y Edad", () =>{
    const text = generateText("Daniel,30");
    expect(text).toBe('Daniel (30 yers old');

});