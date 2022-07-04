package es.deusto.spq.jdo;

import javax.jdo.annotations.PersistenceCapable;
import java.util.Calendar;

@PersistenceCapable
public class Pizza {

    private boolean mozzarella;
    private boolean tomate;
    private boolean carne;
    private boolean jamon;
    private boolean bacon;
    private boolean pimiento;
    private boolean pollo;

    public Pizza() {
        super();
        mozzarella = true;
        tomate = true;
        carne = false;
        jamon = false;
        bacon = false;
        pimiento = false;
        pollo = false;
    }

    public Pizza(boolean mozzarella, boolean tomate, boolean carne, boolean jamon, boolean bacon, boolean pimiento, boolean pollo) {
        this.mozzarella = mozzarella;
        this.tomate = tomate;
        this.carne = carne;
        this.jamon = jamon;
        this.bacon = bacon;
        this.pimiento = pimiento;
        this.pollo = pollo;
    }

    public boolean isMozzarella() {
        return mozzarella;
    }

    public void setMozzarella(boolean mozzarella) {
        this.mozzarella = mozzarella;
    }

    public boolean isTomate() {
        return tomate;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }

    public boolean isCarne() {
        return carne;
    }

    public void setCarne(boolean carne) {
        this.carne = carne;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isPimiento() {
        return pimiento;
    }

    public void setPimiento(boolean pimiento) {
        this.pimiento = pimiento;
    }

    public boolean isPollo() {
        return pollo;
    }

    public void setPollo(boolean pollo) {
        this.pollo = pollo;
    }
}
