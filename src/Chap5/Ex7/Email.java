package Chap5.Ex7;

public class Email extends Document {
    private String subject;
    private String[] to;
    private int toLength;
    public Email(){
        subject= "";
        to= new String[5];
        toLength=0;
    }
    public void setSubject(String s){
        this.subject= s;
    }

    public boolean addRecepient(String email){
        if(toLength<to.length){
            to[toLength]=email;
            toLength++;
            return true;
        }
        return false;
    }
    public boolean removeRecepeint(){
        if (toLength>0){
            to[toLength-1]= null;
            toLength--;
            return true;
        }
        return false;

    }


    public String getTo(){
        StringBuffer buffer= new StringBuffer();
        for(int i= 0; i< toLength; i++){
            buffer.append(to[i]);
            buffer.append(",");
        }
        return buffer.toString();
    }

    public String getSubject() {
        return subject;
    }



    public void setTo(String[] to) {
        this.to = to;
    }


    public String getClassName(){
        return "Email";
    }
    public String getDetails(){
        return  super.getDetails()+", Subject='" + subject + '\'' + "Recepients: "+getTo();
    }
    @Override
    public String toString() {
        return  getClassName()+"{"
                +getDetails()+"}";
    }
}
