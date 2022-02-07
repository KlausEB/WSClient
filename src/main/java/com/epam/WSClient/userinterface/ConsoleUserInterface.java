package com.epam.WSClient.userinterface;

import com.epam.WSClient.IUserInterface;
import com.epam.architecture.soapws.impl.*;

import java.io.IOException;

public class ConsoleUserInterface implements IUserInterface {
    private final AdminSOAPService adminService = new AdminSOAPServiceImplService().getAdminSOAPServiceImplPort();
    private final BookSOAPService bookService = new BookSOAPServiceImplService().getBookSOAPServiceImplPort();
    private final SearchSOAPService searchService = new SearchSOAPServiceImplService().getSearchSOAPServiceImplPort();
    private final UserSOAPService userService = new UserSOAPServiceImplService().getUserSOAPServiceImplPort();


    @Override
    public void loginAccount() throws IOException {

    }

    @Override
    public void takeCommands() {

    }

    @Override
    public void appendBook() throws IOException {

    }

    @Override
    public void deleteBook() throws IOException {

    }

    @Override
    public void appendAuthor() throws IOException {

    }

    @Override
    public void deleteAuthor() throws IOException {

    }

    @Override
    public void searchBooksByPartAuthorName() throws IOException {

    }

    @Override
    public void searchBooksByPartName() throws IOException {

    }

    @Override
    public void searchBookByISBN() throws IOException {

    }

    @Override
    public void searchBooksByYearRange() throws IOException {

    }

    @Override
    public void searchBooksByYearPagesPartName() throws IOException {

    }

    @Override
    public void appendBookmark() throws IOException {

    }

    @Override
    public void deleteBookmark() throws IOException {

    }

    @Override
    public void takeBooksWithMyBookmarks() throws IOException {

    }

    @Override
    public void createNewUser() throws IOException {

    }

    @Override
    public void banUser() throws IOException {

    }

    @Override
    public void takeHistoryOperations() throws IOException {

    }

    @Override
    public void saveData() throws IOException {

    }

    @Override
    public void logout() throws IOException {

    }
}
