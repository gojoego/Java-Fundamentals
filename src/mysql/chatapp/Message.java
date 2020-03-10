package mysql.chatapp;

//POJO

import java.sql.Time;

public class Message {


    private int id;
    private int sender_id;
    private int recipient_id;
    private int group_id;
    private String content;
    private String timestamp;

    public Message(){}

    public Message(int id, int sender_id, int recipient_id, int group_id, String content, String timestamp) {
        this.id = id;
        this.sender_id = sender_id;
        this.recipient_id = recipient_id;
        this.group_id = group_id;
        this.content = content;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSender_id() {
        return sender_id;
    }

    public void setSender_id(int sender_id) {
        this.sender_id = sender_id;
    }

    public int getRecipient_id() {
        return recipient_id;
    }

    public void setRecipient_id(int recipient_id) {
        this.recipient_id = recipient_id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", sender_id=" + sender_id +
                ", recipient_id=" + recipient_id +
                ", group_id=" + group_id +
                ", content='" + content + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
