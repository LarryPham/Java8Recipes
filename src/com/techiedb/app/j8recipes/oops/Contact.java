package com.techiedb.app.j8recipes.oops;

/**
 * @author Larry Pham
 * @since 25.10.2014. The Recipe used Java 8 SDK
 */
public class Contact {
    // Declaring the attitudes which are not accessible to another class.
    // Initializing the default values for them
    private String mFirstName = null;
    private String mLastName = null;
    private int mPosition = 0;
    private int mStatus = 0;

    /**
     * Method default constructor. Generating the default values for its attributes when we
     * used this method to create new instance of <code>Contact</code> class.
     */
    public Contact() {

    }

    /**
     * Method determined constructor. Using this method to create new instance of <code>Contact</code> class
     *
     * @param inFirstName The specified Contact's FirstName
     * @param inLastName  The specified Contact's LastName
     * @param inPost      The specified Contact's Position
     * @param inStatus    The specified Contact's Status
     */
    public Contact(String inFirstName, String inLastName, int inPost, int inStatus) {
        this.mFirstName = inFirstName;
        this.mLastName = inLastName;
        this.mPosition = inPost;
        this.mStatus = inStatus;
    }

    public String getFirstName() {
        return this.mFirstName;
    }

    public void setFirstName(String firstName) {
        this.mFirstName = firstName;
    }

    public String getLastName() {
        return this.mLastName;
    }

    public void setLastName(String lastName) {
        this.mLastName = lastName;
    }

    public int getPosition() {
        return this.mPosition;
    }

    public void setPosition(int position) {
        this.mPosition = position;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public void setStatus(int status) {
        this.mStatus = status;
    }

    @Override
    public int hashCode() {
        return (this.mFirstName + this.mLastName).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getFirstName().equals(((Contact) obj).getFirstName())
                && this.getLastName().equals(((Contact) obj).getLastName())) {
            return true;
        }
        return false;
    }
}
