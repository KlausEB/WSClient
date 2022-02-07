package com.epam.architecture.soapws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for book complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="book">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yearOfPublishing" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "book", propOrder = {
        "authorName",
        "bookISBN",
        "bookName",
        "numberOfPages",
        "yearOfPublishing"
})
public class Book {

    protected String authorName;
    protected String bookISBN;
    protected String bookName;
    protected int numberOfPages;
    protected int yearOfPublishing;

    /**
     * Gets the value of the authorName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * Sets the value of the authorName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAuthorName(String value) {
        this.authorName = value;
    }

    /**
     * Gets the value of the bookISBN property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBookISBN() {
        return bookISBN;
    }

    /**
     * Sets the value of the bookISBN property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBookISBN(String value) {
        this.bookISBN = value;
    }

    /**
     * Gets the value of the bookName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * Sets the value of the bookName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBookName(String value) {
        this.bookName = value;
    }

    /**
     * Gets the value of the numberOfPages property.
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Sets the value of the numberOfPages property.
     */
    public void setNumberOfPages(int value) {
        this.numberOfPages = value;
    }

    /**
     * Gets the value of the yearOfPublishing property.
     */
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    /**
     * Sets the value of the yearOfPublishing property.
     */
    public void setYearOfPublishing(int value) {
        this.yearOfPublishing = value;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", bookISBN='" + bookISBN + '\'' +
                ", bookName='" + bookName + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }
}
