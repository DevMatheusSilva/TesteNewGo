package entities;

public class SenhaValidator {
    
    public Boolean validarTamanho(Senha senha){
        if (senha.getTamanho() >= 10 && senha.getTamanho() <= 30){
            return true;
        } else {
            return false;
        }
    }

    public Boolean validarLetraMaiuscula (Senha senha){
        for (int i = 0; i < senha.getConteudo().length(); i++){
            Character c = new Character(senha.getConteudo().charAt(i));
            if (Character.isUpperCase(c)){
                return true;
            }
        }

        return false;
    }

    public Boolean validarLetraMinuscula (Senha senha){
        for (int i = 0; i < senha.getConteudo().length(); i++){
            Character c = new Character(senha.getConteudo().charAt(i));
            if (Character.isLowerCase(c)){
                return true;
            }
        }

        return false;
    }
    
    public Boolean validarNumero (Senha senha){
        for (int i = 0; i < senha.getConteudo().length(); i++){
            Character c = new Character(senha.getConteudo().charAt(i));
            if (Character.isDigit(c)){
                return true;
            }
        }

        return false;
    }

    public Boolean validarCaractereEspecial (Senha senha){
        for (int i = 0; i < senha.getConteudo().length(); i++){
            Character c = new Character(senha.getConteudo().charAt(i));
            if (!Character.isLetterOrDigit(c)){
                return true;
            }
        }

        return false;
    }

    public Boolean validarSequencia (Senha senha){
        if (senha.getConteudo().contains("abc") || senha.getConteudo().contains("ABC"))){
            if (senha.getConteudo().contains("12345") || senha.getConteudo().contains("qwert")) {
                if (senha.getConteudo().contains("asdfg")){
                    return true;
                }
            }
        } else {
            return false;
        }
    }

}
