/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author dongnpc00702
 */

public class QueryParameter{
    private int position;
    private String value;

    public QueryParameter(int position, String value) {
        this.position = position;
        this.value = value;
    }
    
    public QueryParameter(int position, int value) {
        this.position = position;
        this.value = String.valueOf(value);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
