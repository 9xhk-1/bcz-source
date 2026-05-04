package com.baicizhan.main.activity.setting.offlineclear;

import android.os.Parcel;
import android.os.Parcelable;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.util.JsonSerializer;
import com.baicizhan.client.business.util.NoProguard;
import com.baicizhan.client.business.util.PathUtil;
import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ClearItem implements NoProguard, Parcelable {
    public static final Parcelable.Creator<ClearItem> CREATOR = new a();
    public List<ClearItem> childItems;
    public String name;
    public String path;
    public long size;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.Creator<ClearItem> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClearItem createFromParcel(Parcel in2) {
            return new ClearItem(in2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ClearItem[] newArray(int size) {
            return new ClearItem[size];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends bp.a<ClearItem> {
        public b() {
        }
    }

    public ClearItem() {
        this.size = -1L;
    }

    public boolean clear() {
        return FileUtils.deleteContents(PathUtil.getBaicizhanFile(this.path));
    }

    public void computeSize() {
        List<ClearItem> list = this.childItems;
        if (list != null && !list.isEmpty()) {
            for (ClearItem clearItem : this.childItems) {
                clearItem.computeSize();
                this.size += clearItem.size;
            }
            return;
        }
        File baicizhanFile = PathUtil.getBaicizhanFile(this.path);
        if (baicizhanFile == null || !baicizhanFile.exists()) {
            this.size = 0L;
        } else {
            this.size = FileUtils.sizeOf(baicizhanFile, false);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void reset() {
        this.size = -1L;
    }

    public String toString() {
        return new JsonSerializer(new b().getType()).writeToJson(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.path);
        dest.writeLong(this.size);
        dest.writeTypedList(this.childItems);
    }

    public ClearItem(Parcel in2) {
        this.size = -1L;
        this.name = in2.readString();
        this.path = in2.readString();
        this.size = in2.readLong();
        this.childItems = in2.createTypedArrayList(CREATOR);
    }
}
