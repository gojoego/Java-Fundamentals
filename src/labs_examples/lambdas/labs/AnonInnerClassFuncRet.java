package labs_examples.lambdas.labs;

public class AnonInnerClassFuncRet {

    FunctionalReturn anonRet = new FunctionalReturn() {
        @Override
        public int funcReturn(int m) {
            return 0;
        }
    };

}
