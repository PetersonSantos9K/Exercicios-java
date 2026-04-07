package B.Ex13;

import B.Ex13.Enum.CargoEnum;
import B.Ex13.Model.Funcionario;
import B.Ex13.Model.FuncionarioGerente;
import B.Ex13.Model.FuncionarioTelefonista;
import B.Ex13.Model.FuncionarioVendedor;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();


        System.out.println("Quantos funcionarios deseja adicionar no sistema ? ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){

            System.out.println("Digite o nome do funcionario: ");
            String nomeFuncionario = sc.next();


            System.out.printf("Cargo: 1-%s | 2-%s | 3-%s\nR: ", CargoEnum.GERENTE.name(), CargoEnum.TELEFONISTA.name(), CargoEnum.VENDEDOR.name());
            int escolhaCargo = sc.nextInt();

            switch (escolhaCargo){
                case 1:
                    funcionarios.add(new FuncionarioGerente(nomeFuncionario));
                    break;
                case 2:
                    funcionarios.add(new FuncionarioTelefonista(nomeFuncionario));
                    break;
                case 3:
                    funcionarios.add(new FuncionarioVendedor(nomeFuncionario));
                    break;
                default:
                    System.out.println("Valor invalido!");
                    i--;
                    break;
            }

            System.out.println("Funcionario adicionado!");
        }

        for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario.imprimirFolhaPagamento());
        }


        sc.close();
    }
}
