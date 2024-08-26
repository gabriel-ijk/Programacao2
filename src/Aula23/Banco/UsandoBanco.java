package Aula23.Banco;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsandoBanco {
        private static final String PASTA_CONTAS = "contas";

        static {
            // Criar a pasta se não existir
            File pasta = new File("C:\\Users\\gsche\\OneDrive\\Documentos");
            if (!pasta.exists()) {
                pasta.mkdir();
            }
        }

        public static void salvarConta(Conta conta) {
            try (FileOutputStream fileOut = new FileOutputStream("C:\\Users\\gsche\\OneDrive\\Documentos" + "\\" + conta.identificador + ".ser");
                 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(conta);
            } catch (IOException i) {
                i.printStackTrace();
            }
        }

        public static List<Conta> carregarContas() {
            List<Conta> contas = new ArrayList<>();
            File pasta = new File(PASTA_CONTAS);
            File[] arquivos = pasta.listFiles((dir, name) -> name.endsWith(".ser"));

            if (arquivos != null) {
                for (File arquivo : arquivos) {
                    try (FileInputStream fileIn = new FileInputStream(arquivo);
                         ObjectInputStream in = new ObjectInputStream(fileIn)) {
                        Conta conta = (Conta) in.readObject();
                        contas.add(conta);
                    } catch (IOException | ClassNotFoundException i) {
                        i.printStackTrace();
                    }
                }
            }
            return contas;
        }
    }