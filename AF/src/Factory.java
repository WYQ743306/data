public class Factory {
    public static Operation createOperation(String opt){
        Operation operation=null;
        if("+".equals(opt)){
            operation=new OperationAdd();
        }
        return operation;
    }
}
