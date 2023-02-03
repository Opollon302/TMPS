public class ButtonFactory {
  public Button getButton(String buttonType){
      if(buttonType == null){
          return null;
      }
      if(buttonType.equalsIgnoreCase("WINDOWS")) {
          return new WindowsButton();
      }
      else if(buttonType.equalsIgnoreCase("HTML")){
          return new HTMLButton();
      }

      return null;
  }

}
