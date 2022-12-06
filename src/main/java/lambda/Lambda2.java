package lambda;


    interface MyInter{
        int add(int a,int b);
    }

    class LambdaExpressionExample {
        public static void main(String[] args) {

            // Lambda expression without return keyword.

            MyInter ad1 = (a,b) -> (a+b);
            System.out.println(ad1.add(100,20));

            // Lambda expression with return keyword.

            MyInter ad2 = (int a,int b) -> {
                return (a+b);
            };

            System.out.println(ad2.add(100,200));
        }
    }

