package ca.ualberta.cs.lonelytweet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by MonicaB on 2018-03-13.
 */

abstract public class LonelyTweet implements Serializable {
    private static final long serialVersionUID = 1L;

    // REFACTORED HERE
    // MADE IT PACKAGED PRIVATE SO ITS ONLY ACCESSIBLE WITHIN THE PACKAGE ITSELF
    Date tweetDate;

    protected String tweetBody;

    //REFACTORED HERE
    // MADE IT PACKAGED PRIVATE SO ITS ONLY ACCESSIBLE WITHIN THE PACKAGE ITSELF
    Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    public void setTweetBody(String tweetBody) {
        this.tweetBody = tweetBody;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }

    public abstract boolean isValid();
}
