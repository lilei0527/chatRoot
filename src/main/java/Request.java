class Request {
    //请求的类型
     private String socketType;
    //接受信息的人的名字
    private String name;
    //要发送的信息
    private String message;
    //发送信息的人的名字
    private String sendName;

    Request() {

    }

    public String getSocketType() {
        return socketType;
    }

    public void setSocketType(String socketType) {
        this.socketType = socketType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }
}
