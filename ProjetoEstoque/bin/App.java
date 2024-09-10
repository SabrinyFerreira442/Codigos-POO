
public class App {
   public App() {
   }

   public static void main(String[] args) throws Exception {
      ClasseProdutoVisao visao = new ClasseProdutoVisao();
      visao.Exibir();
   }

    private static class ClasseProdutoVisao {

        public ClasseProdutoVisao() {
        }

        private void Exibir() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public String toString() {
            return "ClasseProdutoVisao []";
        }
    }
}
