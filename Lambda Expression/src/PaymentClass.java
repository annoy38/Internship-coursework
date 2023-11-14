import java.util.List;

public class PaymentClass {

    private long paymentId;
    private String userName;
    private String userEmail;
    private String gender;
    private int itemQuantity;
    private List<String> itemList;
    private int totalBill;

    public PaymentClass(long paymentId, String userName, String userEmail, String gender, int itemQuantity, List<String> itemList, int totalBill) {
        this.paymentId = paymentId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.gender = gender;
        this.itemQuantity = itemQuantity;
        this.itemList = itemList;
        this.totalBill = totalBill;
    }

    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public List<String> getItemList() {
        return itemList;
    }

    public void setItemList(List<String> itemList) {
        this.itemList = itemList;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
}
