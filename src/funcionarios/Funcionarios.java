package funcionarios;

public class Funcionarios {
    private String name;
    private String position;
    private String wage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
        switch(position) {
            case "estagiário":
                setWage("800,00");
                break;
            case "júnior":
                setWage("1200,00");
                break;
            case "sênior":
                setWage("2500,00");
                break;
            default:
                System.out.println("Cargo inválido.");
        }
        }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Status do funcionário: " +
                "nome= " + name +
                ", posição= " + position +
                ", salário='" + wage ;
    }

    public void statusFuncionario(Funcionarios funcionarios){
        System.out.println(funcionarios);
    }

    public void verificaHomeOffice(String cargo){
        if(cargo.equals("estagiário")){
            System.out.println("Esquema de trabalho: 100% home office");
        } else if(cargo.equals("júnior")){
            System.out.println("Esquema de trabalho: Presencial");
        }
        else if(cargo.equals("sênior")){
            System.out.println("Esquema de trabalho: híbrido");
        } else{
            System.out.println("Cargo inválido.");
        }

    }


}


//        Crie uma classe que represente funcionários de uma empresa, utilize como
//        atributos: nome, cargo e salário. Crie o método que imprima todos os dados do
//        funcionário e um método que informe se ele trabalha 100% Home Office,
//        Presencial ou Híbrido.
//        Obrigatório seguir regras abaixo:
//        Estagiário – 800,00 – 100% home office
//        Junior – 1200,00 – Presencial
//        Sênior – 2500,00 Híbrido
