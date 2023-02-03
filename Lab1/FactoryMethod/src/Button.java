abstract class Button {
    public int buttonID;

    abstract Button createButton(Button button);

    public void getButtonID(int num){

        buttonID=num++;
        System.out.print( buttonID );

    }
}
