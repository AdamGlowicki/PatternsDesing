package com.adamglowicki.FlightLeg;

public class FlightLeg {

    private String From;
    private String to;
    private String delayed;
    private String price;

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDelayed() {
        return delayed;
    }

    public void setDelayed(String delayed) {
        this.delayed = delayed;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FlightLeg{");
        sb.append("From='").append(From).append('\'');
        sb.append(", to='").append(to).append('\'');
        sb.append(", delayed='").append(delayed).append('\'');
        sb.append(", price='").append(price).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
