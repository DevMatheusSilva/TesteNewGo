package entities;

public class Senha{

    private String conteudo;
    private int forca;

    public Senha (String conteudo){
        this.conteudo = conteudo;
    }

    public void alterarSenha(String novaSenha){
        this.conteudo = novaSenha;
    }

    public int getTamanho(){
        return this.conteudo.length();
    }

    public String getConteudo(){
        return this.conteudo;
    }

    public void setForca(int forca){
        this.forca = forca;
    }


}
