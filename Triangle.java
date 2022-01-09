/*
* This class creates an integer stack
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

/**
* This is the standard "lock" program.
*/
public class Triangle {
    /**
    * The space.
    */
    private static final String SPACE = "\n";
    /**
    * The ninety.
    */
    private static final int NINETY = 90;

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
    public void setAaSide(final double aSideInput) {
        this.aSide = aSideInput;
    }

    /**
    * Set b side.
    *
    * @param bSideInput B side
    *
    */
    public void setBbSide(final double bSideInput) {
        this.bSide = bSideInput;
    }

    /**
    * Set c side.
    *
    * @param cSideInput C side
    *
    */
    public void setCcSide(final double cSideInput) {
        this.cSide = cSideInput;
    }

    /**
    * Get check.
    *
    * @return check
    */
    public boolean check() {
        boolean checkPut = true;
        final double aCheck = this.bSide + this.cSide;
        final double bCheck = this.aSide + this.cSide;
        final double cCheck = this.aSide + this.bSide;
        if (this.aSide <= 0) {
            checkPut = false;
        } else if (this.bSide <= 0) {
            checkPut = false;
        } else if (this.cSide <= 0) {
            checkPut = false;
        } else if (aCheck <= this.aSide) {
            checkPut = false;
        } else if (bCheck <= this.bSide) {
            checkPut = false;
        } else if (cCheck <= this.cSide) {
            checkPut = false;
        }
        return checkPut;
    }

    /**
    * Calculate the area.
    *
    * @return area
    */
    public double area() {
        final double sem = (this.aSide + this.bSide + this.cSide) / 2;

        final double areaPut = Math.sqrt(sem * (sem - this.aSide)
                                         * (sem - this.bSide)
                                         * (sem - this.cSide));
        return Math.round(areaPut);
    }

    /**
    * Calculate perimeter.
    *
    * @return perimeter
    */
    public double perimeter() {
        final double perimeterPut = this.aSide + this.bSide + this.cSide;
        return Math.round(perimeterPut);
    }

    /**
    * Angle.
    */
    public void putAngles() {
        final double cosA = (Math.pow(this.bSide, 2) + Math.pow(this.cSide, 2)
                       - Math.pow(this.aSide, 2))
                       / (2 * this.bSide * this.cSide);
        final double cosB = (Math.pow(this.aSide, 2) + Math.pow(this.cSide, 2)
                       - Math.pow(this.bSide, 2))
                       / (2 * this.aSide * this.cSide);
        final double cosC = (Math.pow(this.aSide, 2) + Math.pow(this.bSide, 2)
                       - Math.pow(this.cSide, 2))
                       / (2 * this.aSide * this.bSide);
        this.aAngle = Math.toDegrees(Math.acos(cosA));
        this.bAngle = Math.toDegrees(Math.acos(cosB));
        this.cAngle = Math.toDegrees(Math.acos(cosC));
        System.out.println(SPACE
                           + "Angle a: " + Math.round(this.aAngle)
                           + SPACE
                           + "Angle b: " + Math.round(this.bAngle)
                           + SPACE
                           + "Angle c: " + Math.round(this.cAngle)
        );
    }

    /**
    * Type.
    */
    public void type() {
        if (this.aSide == this.bSide && this.bSide == this.cSide) {
            System.out.println("It is Equilateral Triangle.");
        } else if (this.aSide == this.bSide
            || this.aSide == this.cSide
            || this.bSide == this.cSide) {
            System.out.println("It is Isosceles Triangle.");
        } else {
            System.out.println("It is Scalene Triangle.");
        }
        if (this.aAngle < NINETY
            && this.bAngle < NINETY
            && this.cAngle < NINETY) {
            System.out.println("It is Acute-Angled Triangle.");
        } else if (this.aAngle > NINETY
                   || this.bAngle > NINETY
                   || this.cAngle > NINETY) {
            System.out.println("It is Obtuse-Angled Triangle.");
        } else {
            System.out.println("It is Right-Angled Triangle.");
        }
    }

}

