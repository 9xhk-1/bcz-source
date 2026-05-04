package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.a;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3162a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3163b;

    /* renamed from: c, reason: collision with root package name */
    public android.support.v4.os.a f3164c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i11) {
            return new ResultReceiver[i11];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends a.b {
        public b() {
        }

        @Override // android.support.v4.os.a
        public void b(int i11, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f3163b;
            if (handler != null) {
                handler.post(resultReceiver.new c(i11, bundle));
            } else {
                resultReceiver.a(i11, bundle);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f3166a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f3167b;

        public c(int i11, Bundle bundle) {
            this.f3166a = i11;
            this.f3167b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.a(this.f3166a, this.f3167b);
        }
    }

    public ResultReceiver(Handler handler) {
        this.f3162a = true;
        this.f3163b = handler;
    }

    public void b(int i11, Bundle bundle) {
        if (this.f3162a) {
            Handler handler = this.f3163b;
            if (handler != null) {
                handler.post(new c(i11, bundle));
                return;
            } else {
                a(i11, bundle);
                return;
            }
        }
        android.support.v4.os.a aVar = this.f3164c;
        if (aVar != null) {
            try {
                aVar.b(i11, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        synchronized (this) {
            try {
                if (this.f3164c == null) {
                    this.f3164c = new b();
                }
                parcel.writeStrongBinder(this.f3164c.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f3162a = false;
        this.f3163b = null;
        this.f3164c = a.b.x0(parcel.readStrongBinder());
    }

    public void a(int i11, Bundle bundle) {
    }
}
