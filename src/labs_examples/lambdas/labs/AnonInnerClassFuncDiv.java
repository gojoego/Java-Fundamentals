package labs_examples.lambdas.labs;

public class AnonInnerClassFuncDiv {

    FunctionalDivide anonDiv = new FunctionalDivide() {
        @Override
        public double divide(double a, double b) {
            return 0;
        }
    };

}
