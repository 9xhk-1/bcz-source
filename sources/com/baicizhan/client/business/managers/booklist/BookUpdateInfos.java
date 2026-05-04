package com.baicizhan.client.business.managers.booklist;

import android.os.Parcel;
import android.os.Parcelable;
import com.baicizhan.online.user_study_api.BookReplaceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class BookUpdateInfos implements Parcelable {
    public static final Parcelable.Creator<BookUpdateInfos> CREATOR = new Parcelable.Creator<BookUpdateInfos>() { // from class: com.baicizhan.client.business.managers.booklist.BookUpdateInfos.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BookUpdateInfos createFromParcel(Parcel in2) {
            return new BookUpdateInfos(in2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BookUpdateInfos[] newArray(int size) {
            return new BookUpdateInfos[size];
        }
    };
    List<BookUpdateInfo> updates;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookUpdateInfo implements Parcelable {
        public static final Parcelable.Creator<BookUpdateInfo> CREATOR = new Parcelable.Creator<BookUpdateInfo>() { // from class: com.baicizhan.client.business.managers.booklist.BookUpdateInfos.BookUpdateInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public BookUpdateInfo createFromParcel(Parcel in2) {
                return new BookUpdateInfo(in2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public BookUpdateInfo[] newArray(int size) {
                return new BookUpdateInfo[size];
            }
        };
        public boolean isForceUpdate;
        public String mainPageDialogCancel;
        public String mainPageDialogContent;
        public String mainPageDialogOk;
        public String mainPageDialogTitle;
        public int newBookId;
        public int oldBookId;

        public BookUpdateInfo() {
        }

        public static BookUpdateInfo from(BookReplaceInfo in2) {
            BookUpdateInfo bookUpdateInfo = new BookUpdateInfo();
            bookUpdateInfo.oldBookId = in2.old_book_id;
            bookUpdateInfo.newBookId = in2.new_book_id;
            bookUpdateInfo.isForceUpdate = in2.force_update;
            bookUpdateInfo.mainPageDialogTitle = in2.main_page_popup_title;
            bookUpdateInfo.mainPageDialogContent = in2.main_page_popup_content;
            bookUpdateInfo.mainPageDialogOk = in2.main_page_popup_ok_text;
            bookUpdateInfo.mainPageDialogCancel = in2.main_page_popup_cancel_text;
            return bookUpdateInfo;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.oldBookId);
            parcel.writeInt(this.newBookId);
            parcel.writeInt(this.isForceUpdate ? 1 : 0);
            parcel.writeString(this.mainPageDialogTitle);
            parcel.writeString(this.mainPageDialogContent);
            parcel.writeString(this.mainPageDialogOk);
            parcel.writeString(this.mainPageDialogCancel);
        }

        public BookUpdateInfo(Parcel in2) {
            this.oldBookId = in2.readInt();
            this.newBookId = in2.readInt();
            this.isForceUpdate = in2.readInt() == 1;
            this.mainPageDialogTitle = in2.readString();
            this.mainPageDialogContent = in2.readString();
            this.mainPageDialogOk = in2.readString();
            this.mainPageDialogCancel = in2.readString();
        }
    }

    public BookUpdateInfos() {
    }

    public static BookUpdateInfos from(List<BookReplaceInfo> updates) {
        BookUpdateInfos bookUpdateInfos = new BookUpdateInfos();
        bookUpdateInfos.updates = new ArrayList();
        Iterator<BookReplaceInfo> it = updates.iterator();
        while (it.hasNext()) {
            bookUpdateInfos.updates.add(BookUpdateInfo.from(it.next()));
        }
        return bookUpdateInfos;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.updates);
    }

    public BookUpdateInfos(Parcel in2) {
        this.updates = in2.createTypedArrayList(BookUpdateInfo.CREATOR);
    }
}
