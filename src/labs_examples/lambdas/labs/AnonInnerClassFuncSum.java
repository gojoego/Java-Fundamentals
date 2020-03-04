package labs_examples.lambdas.labs;

public class AnonInnerClassFuncSum {

    FunctionalSum anonSum = new FunctionalSum() {
        @Override
        public int sum(int a, int b) {
            return a + b;
        }
    };
}
