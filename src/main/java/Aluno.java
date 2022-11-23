
public class Aluno {
    public String nome;
    private float nota1,nota2,nota3, nota4;
    public float media;
    

    
    public Aluno() {
    }

    public Aluno(String nome,float nota1, float nota2, float nota3, float nota4, float media) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.media = media;
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getNome() + "," + this.getMedia();
    }
    
    
    public float CalcularMedia (float NOTA1, float NOTA2, float NOTA3, float NOTA4){
    
     media = (NOTA1 + NOTA2 + NOTA3 + NOTA4)/4;
    
    return media;
    
    }
    
    
}
