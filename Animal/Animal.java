public class Animal {
    public String Nome;
    public String Classe;
    public String Familia;
    public int Idade;
    public void untitledMethod() {
    }
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        animal1.Nome="Totó";
        animal1.Classe = "mamífero";
        animal1.Familia = "Canídeo";
        animal1.Idade = 5;
        animal2.Nome="Chiquinho";
        animal2.Classe = "mamífero";
        animal2.Familia = "Felídio";
        animal2.Idade = 3;
        animal3.Nome="Amarelo";
        animal3.Classe = "ave";
        animal3.Familia = "Fringilidae";
        animal3.Idade = 1;
        System.out.println("Nome do animal 1: " + animal1.Nome);
        System.out.println("Classe: " + animal1.Classe);
        System.out.println("Familia: " + animal1.Familia);
        System.out.println("Idade: " + animal1.Idade);
        System.out.println("Nome do animal 2: " + animal2.Nome);
        System.out.println("Classe: " + animal2.Classe);
        System.out.println("Familia: " + animal2.Familia);
        System.out.println("Idade: " + animal2.Idade);
        System.out.println("Nome do animal 3: " + animal3.Nome);
        System.out.println("Classe: " + animal3.Classe);
        System.out.println("Familia: " + animal3.Familia);
        System.out.println("Idade: " + animal3.Idade);
    }
}
