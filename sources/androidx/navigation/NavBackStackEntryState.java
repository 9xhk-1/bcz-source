package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"BanParcelableUsage"})
@u0({"SMAP\nNavBackStackEntryState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryState.kt\nandroidx/navigation/NavBackStackEntryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* loaded from: classes3.dex */
public final class NavBackStackEntryState implements Parcelable {

    @l
    private final Bundle args;
    private final int destinationId;

    /* renamed from: id, reason: collision with root package name */
    @k
    private final String f5291id;

    @k
    private final Bundle savedState;

    @k
    public static final Companion Companion = new Companion(null);

    @g
    @k
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new Parcelable.Creator<NavBackStackEntryState>() { // from class: androidx.navigation.NavBackStackEntryState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NavBackStackEntryState createFromParcel(Parcel inParcel) {
            g0.p(inParcel, "inParcel");
            return new NavBackStackEntryState(inParcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NavBackStackEntryState[] newArray(int i11) {
            return new NavBackStackEntryState[i11];
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public NavBackStackEntryState(@k NavBackStackEntry entry) {
        g0.p(entry, "entry");
        this.f5291id = entry.getId();
        this.destinationId = entry.getDestination().getId();
        this.args = entry.getArguments();
        Bundle bundle = new Bundle();
        this.savedState = bundle;
        entry.saveState(bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Bundle getArgs() {
        return this.args;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    @k
    public final String getId() {
        return this.f5291id;
    }

    @k
    public final Bundle getSavedState() {
        return this.savedState;
    }

    @k
    public final NavBackStackEntry instantiate(@k Context context, @k NavDestination destination, @k Lifecycle.State hostLifecycleState, @l NavControllerViewModel navControllerViewModel) {
        g0.p(context, "context");
        g0.p(destination, "destination");
        g0.p(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.args;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return NavBackStackEntry.Companion.create(context, destination, bundle, hostLifecycleState, navControllerViewModel, this.f5291id, this.savedState);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int i11) {
        g0.p(parcel, "parcel");
        parcel.writeString(this.f5291id);
        parcel.writeInt(this.destinationId);
        parcel.writeBundle(this.args);
        parcel.writeBundle(this.savedState);
    }

    public NavBackStackEntryState(@k Parcel inParcel) {
        g0.p(inParcel, "inParcel");
        String readString = inParcel.readString();
        g0.m(readString);
        this.f5291id = readString;
        this.destinationId = inParcel.readInt();
        this.args = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle readBundle = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        g0.m(readBundle);
        this.savedState = readBundle;
    }
}
