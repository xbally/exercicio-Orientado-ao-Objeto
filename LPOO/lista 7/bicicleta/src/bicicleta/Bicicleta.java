/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleta;

/**
 *
 * @author ronaldoniz
 */
class Bicicleta {

    private int cadencia;
    private int velocidade;
    private int marcha;

    public Bicicleta(int cadencia, int velocidade, int marcha) {
        this.cadencia = cadencia;
        this.velocidade = velocidade;
        this.marcha = marcha;
    }

    void mudarCadencia(int novoValor) throws Exception {
        if (novoValor > 0) {
            cadencia = novoValor;
        } else {
            throw new Exception("RPM negativo.");
        }
    }

    void mudarMarcha(int novoValor) throws Exception {
        if (novoValor >= 0 && novoValor <= 24) {
            marcha = novoValor;
        } else {
            throw new Exception("Marcha inválida.");
        }
    }

    void aumentarVelocidade(int incremento) throws Exception {
        if (velocidade + incremento <= 100) {
            velocidade = velocidade + incremento;
        } else {
            throw new Exception("Velocidade maior que 100km/h");
        }
    }

    void aplicarFreios(int decremento) throws Exception {
        if (velocidade - decremento > 0) {
            velocidade = velocidade - decremento;
        } else {
            throw new Exception("Velocidade negativa.");
        }
    }

    void printStates() {
        System.out.println("cadencia=" + cadencia + " velocidade=" + velocidade
                + " marcha = " + marcha);
    }

//    public int getCadencia() {
//        return cadencia;
//    }
//
//    public void setCadencia(int cadencia) throws Exception {
//        if (cadencia >= 0) {
//            this.cadencia = cadencia;
//        } else {
//            throw new Exception("Cadência negativa");
//        }
//    }
//
//    public int getVelocidade() {
//        return velocidade;
//    }
//
//    public void setVelocidade(int velocidade) throws Exception {
//        if (velocidade >= 0 && velocidade <= 100) {
//            this.velocidade = velocidade;
//        } else {
//            throw new Exception("Velocidade negativa ou maior que 100km/h");
//        }
//    }
//
//    public int getMarcha() {
//        return marcha;
//    }
//
//    public void setMarcha(int marcha) throws Exception {
//        if (marcha >= 0 && marcha <= 24) {
//            this.marcha = marcha;
//        } else {
//            throw new Exception("Marcha negativa ou maior que 24");
//        }
//    }
}
