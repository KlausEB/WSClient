package com.epam.WSClient.util;

import com.epam.WSClient.util.actions.UserAction;
import com.epam.WSClient.util.actions.impl.*;

public enum CommandsEnum {
    LOGIN(new LoginAction()),
    COMMANDS_INFO(new CommandsInfoAction()),
    ADD_BOOK(new AddBookAction()),
    DELETE_BOOK(new DeleteBookAction()),
    ADD_AUTHOR(new AddAuthorAction()),
    DELETE_AUTHOR(new DeleteAuthorAction()),
    SEARCH_BOOKS_BY_PART_AUTHOR_NAME(new SearchBooksByAuthorAction()),
    SEARCH_BOOKS_BY_PART_NAME(new SearchBooksByNameAction()),
    SEARCH_BOOK_BY_ISBN(new SearchBookByISBNAction()),
    SEARCH_BOOKS_BY_YEAR_RANGE(new SearchBooksByYearRangeAction()),
    SEARCH_BOOKS_BY_YEAR_PAGES_PART_NAME(new SearchBooksByYearPagesNameAction()),
    ADD_BOOKMARK(new AddBookmarkAction()),
    DELETE_BOOKMARK(new DeleteBookmarkAction()),
    TAKE_BOOKS_WITH_MY_BOOKMARKS(new TakeBooksWithMyBookmarkAction()),
    CREATE_NEW_USER(new CreateNewUserAction()),
    BAN_USER(new BanUserAction()),
    TAKE_HISTORY_OPERATIONS(new TakeHistoryAction()),
    SAVE_DATA(new SaveDataAction());

    UserAction userAction;

    CommandsEnum(UserAction userAction) {
        this.userAction = userAction;
    }

    public UserAction getUserAction() {
        return userAction;
    }
}
