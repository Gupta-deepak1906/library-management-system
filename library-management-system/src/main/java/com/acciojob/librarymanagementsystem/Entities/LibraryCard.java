package com.acciojob.librarymanagementsystem.Entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="card_info")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor


public class LibraryCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;
    private CardStatus cardStatus;
    private int noOfBooksIssued;
    private Date validity;

    public LibraryCard(int cardNo) {
        this.cardNo = cardNo;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }
}
