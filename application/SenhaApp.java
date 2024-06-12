package application;

import java.util.Scanner;

import entities.Senha;
import entities.SenhaValidator;

public class SenhaApp {
    
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        SenhaValidator validator = new SenhaValidator();
        

        System.out.print("Digite uma senha: ");
        String conteudo = sc.nextLine();

        Senha senha = new Senha(conteudo);

        int forca = 0;

        if (senha.getTamanho() == 10){
            forca = 75;
        }

        if (senha.getTamanho() == 30){
            forca = 100;
        }


        if (validator.validarTamanho(senha)){

            if (validator.validarLetraMaiuscula(senha)){
                forca += senha.getTamanho() / 25;
                senha.setForca(forca);
            } else {
                forca -= senha.getTamanho() / 25;
                senha.setForca(forca);
            }

            if (validator.validarLetraMinuscula(senha)){
                forca += senha.getTamanho() / 25;
                senha.setForca(forca);
            } else {
                forca -= senha.getTamanho() / 25;
                senha.setForca(forca);
            }

            if (validator.validarNumero(senha)){
                forca += senha.getTamanho() / 25;
                senha.setForca(forca);
            } else {
                forca -= senha.getTamanho() / 25;
                senha.setForca(forca);
            }

            if (validator.validarCaractereEspecial(senha)){
                forca += senha.getTamanho() / 25;
                senha.setForca(forca);
            } else {
                forca -= senha.getTamanho() / 25;
                senha.setForca(forca);
            }

            if (validator.validarCaractereEspecial(senha)){
                forca += senha.getTamanho() / 25;
                senha.setForca(forca);
            } else {
                forca -= senha.getTamanho() / 25;
                senha.setForca(forca);
            }

            if (validator.validarSequencia(senha)){
                forca += senha.getTamanho() / 25;
                senha.setForca(forca);
            } else {
                forca -= senha.getTamanho() / 25;
                senha.setForca(forca);
            }
        }

        sc.close();
    }

}
