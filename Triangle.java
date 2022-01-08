/*
* This class creates an integer stack
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

import java.util.Math;

/**
* This is the standard "lock" program.
*/
public class Vehicle {
    /**
    * A side.
    */
    private double aSide;
    /**
    * B side.
    */
    private double bSide;
    /**
    * C side.
    */
    private double cSide;

    /**
    * A angle.
    */
    private double aAngle;
    /**
    * B angle.
    */
    private double bAngle;
    /**
    * C angle.
    */
    private double cAngle;

    /**
    * Set a side.
    *
    * @param aSideInput A side
    *
    */
    public void setASide(final double aSideInput) {
        this.aSide = aSideInput;
    }

    /**
    * Set b side.
    *
    * @param bSideInput B side
    *
    */
    public void setBSide(final double bSideInput) {
        this.bSide = bSideInput;
    }

    /**
    * Set c side.
    *
    * @param cSideInput C side
    *
    */
    public void setCSide(final double cSideInput) {
        this.cSide = cSideInput;
    }

    /**
    * Get check.
    *
    * @return check
    */
    public boolean check() {
        boolean checkPut = true;
        double aCheck = this.bSide + this.cSide;
        double bCheck = this.aSide + this.cSide;
        double cCheck = this.aSide + this.bSide;
        if (this.aSide <= 0) {
            checkPut  = false;
        } else if (this.bSide <= 0) {
            checkPut  = false;
        } else if (this.cSide <= 0) {
            checkPut  = false;
        } else if (aCheck >= this.aSide) {
            checkPut  = false;
        } else if (bCheck >= this.bSide) {
            checkPut  = false;
        } else if (cCheck >= this.cSide) {
            checkPut  = false;
        }
        return checkPut;
    }

    /**
    * Calculate the area.
    *
    * @return area
    */
    public double area() {
        sem = (this.aSide + this.bSide + this.cSide) / 2;

        double areaPut = Math.sqrt(sem *(sem - this.aSide)
                                   * (sem - this.bSide)
                                   * (sem - this.cSide));
        return areaPut 
    }

    /**
    * Calculate perimeter.
    *
    * @return 
    */
    public double perimeter() {
        double perimeterPut = this.aSide + this.bSide + this.cSide;
        return perimeterPut;
    }

    /**
    * Set colour.
    */
    public void putAngles() {
        double cosA = ((Math.pow(this.bSide) + Math.pow(this.cSide)
                       - Math.pow(this.aSide)) 
                       / (2 * this.bSide * this.cSide));
        double cosB = ((Math.pow(this.aSide) + Math.pow(this.cSide)
                       - Math.pow(this.bSide))
                       / (2 * this.aSide * this.cSide));
        double cosC = ((Math.pow(this.aSide) + Math.pow(this.bSide)
                       - Math.pow(this.cSide))
                       / (2 * this.aSide * this.bSide));
        this.aAngle = Math.toDegrees(Math.asin(cosA));
        this.bAngle = Math.toDegrees(Math.asin(cosB));
        this.cAngle = Math.toDegrees(Math.asin(cosC));
        System.out.println("\n"
                           + "Angle a: " + this.aAngle
                           + "\n"
                           + "Angle b: " + this.bAngle
                           + "\n"
                           + "Angle c: " + this.cAngle
        );
    }

    /**
    * Type.
    */
    public void type() {
        if (this.aSide = this.bSide && this.bSide = this.cSide) {
            System.out.println("It is Equilateral Triangle.");
        } else if (this.aSide = this.bSide
            || this.aSide = this.cSide
            || this.bSide = this.cSide) {
            System.out.println("It is Isosceles Triangle.");
        } else {
            System.out.println("It is Scalene Triangle.");
        }
        if (this.aAngle < 90
            && this.bAngle < 90
            && this.cAngle < 90) {
            System.out.println("It is Acute-Angled Triangle.");
        } else if (this.aAngle > 90
                   || this.bAngle > 90
                   || this.cAngle > 90) {
            System.out.println("It is Obtuse-Angled Triangle.");
        } else {
            System.out.println("It is Right-Angled Triangle.");
        }
    }

}

