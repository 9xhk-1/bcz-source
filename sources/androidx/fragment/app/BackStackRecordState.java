package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new Parcelable.Creator<BackStackRecordState>() { // from class: androidx.fragment.app.BackStackRecordState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BackStackRecordState[] newArray(int i11) {
            return new BackStackRecordState[i11];
        }
    };
    private static final String TAG = "FragmentManager";
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int[] mCurrentMaxLifecycleStates;
    final ArrayList<String> mFragmentWhos;
    final int mIndex;
    final String mName;
    final int[] mOldMaxLifecycleStates;
    final int[] mOps;
    final boolean mReorderingAllowed;
    final ArrayList<String> mSharedElementSourceNames;
    final ArrayList<String> mSharedElementTargetNames;
    final int mTransition;

    public BackStackRecordState(BackStackRecord backStackRecord) {
        int size = backStackRecord.mOps.size();
        this.mOps = new int[size * 6];
        if (!backStackRecord.mAddToBackStack) {
            throw new IllegalStateException("Not on back stack");
        }
        this.mFragmentWhos = new ArrayList<>(size);
        this.mOldMaxLifecycleStates = new int[size];
        this.mCurrentMaxLifecycleStates = new int[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            FragmentTransaction.Op op2 = backStackRecord.mOps.get(i12);
            int i13 = i11 + 1;
            this.mOps[i11] = op2.mCmd;
            ArrayList<String> arrayList = this.mFragmentWhos;
            Fragment fragment = op2.mFragment;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.mOps;
            iArr[i13] = op2.mFromExpandedOp ? 1 : 0;
            iArr[i11 + 2] = op2.mEnterAnim;
            iArr[i11 + 3] = op2.mExitAnim;
            int i14 = i11 + 5;
            iArr[i11 + 4] = op2.mPopEnterAnim;
            i11 += 6;
            iArr[i14] = op2.mPopExitAnim;
            this.mOldMaxLifecycleStates[i12] = op2.mOldMaxState.ordinal();
            this.mCurrentMaxLifecycleStates[i12] = op2.mCurrentMaxState.ordinal();
        }
        this.mTransition = backStackRecord.mTransition;
        this.mName = backStackRecord.mName;
        this.mIndex = backStackRecord.mIndex;
        this.mBreadCrumbTitleRes = backStackRecord.mBreadCrumbTitleRes;
        this.mBreadCrumbTitleText = backStackRecord.mBreadCrumbTitleText;
        this.mBreadCrumbShortTitleRes = backStackRecord.mBreadCrumbShortTitleRes;
        this.mBreadCrumbShortTitleText = backStackRecord.mBreadCrumbShortTitleText;
        this.mSharedElementSourceNames = backStackRecord.mSharedElementSourceNames;
        this.mSharedElementTargetNames = backStackRecord.mSharedElementTargetNames;
        this.mReorderingAllowed = backStackRecord.mReorderingAllowed;
    }

    private void fillInBackStackRecord(@NonNull BackStackRecord backStackRecord) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= this.mOps.length) {
                backStackRecord.mTransition = this.mTransition;
                backStackRecord.mName = this.mName;
                backStackRecord.mAddToBackStack = true;
                backStackRecord.mBreadCrumbTitleRes = this.mBreadCrumbTitleRes;
                backStackRecord.mBreadCrumbTitleText = this.mBreadCrumbTitleText;
                backStackRecord.mBreadCrumbShortTitleRes = this.mBreadCrumbShortTitleRes;
                backStackRecord.mBreadCrumbShortTitleText = this.mBreadCrumbShortTitleText;
                backStackRecord.mSharedElementSourceNames = this.mSharedElementSourceNames;
                backStackRecord.mSharedElementTargetNames = this.mSharedElementTargetNames;
                backStackRecord.mReorderingAllowed = this.mReorderingAllowed;
                return;
            }
            FragmentTransaction.Op op2 = new FragmentTransaction.Op();
            int i13 = i11 + 1;
            op2.mCmd = this.mOps[i11];
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Instantiate " + backStackRecord + " op #" + i12 + " base fragment #" + this.mOps[i13]);
            }
            op2.mOldMaxState = Lifecycle.State.values()[this.mOldMaxLifecycleStates[i12]];
            op2.mCurrentMaxState = Lifecycle.State.values()[this.mCurrentMaxLifecycleStates[i12]];
            int[] iArr = this.mOps;
            int i14 = i11 + 2;
            if (iArr[i13] == 0) {
                z11 = false;
            }
            op2.mFromExpandedOp = z11;
            int i15 = iArr[i14];
            op2.mEnterAnim = i15;
            int i16 = iArr[i11 + 3];
            op2.mExitAnim = i16;
            int i17 = i11 + 5;
            int i18 = iArr[i11 + 4];
            op2.mPopEnterAnim = i18;
            i11 += 6;
            int i19 = iArr[i17];
            op2.mPopExitAnim = i19;
            backStackRecord.mEnterAnim = i15;
            backStackRecord.mExitAnim = i16;
            backStackRecord.mPopEnterAnim = i18;
            backStackRecord.mPopExitAnim = i19;
            backStackRecord.addOp(op2);
            i12++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public BackStackRecord instantiate(@NonNull FragmentManager fragmentManager) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
        fillInBackStackRecord(backStackRecord);
        backStackRecord.mIndex = this.mIndex;
        for (int i11 = 0; i11 < this.mFragmentWhos.size(); i11++) {
            String str = this.mFragmentWhos.get(i11);
            if (str != null) {
                backStackRecord.mOps.get(i11).mFragment = fragmentManager.findActiveFragment(str);
            }
        }
        backStackRecord.bumpBackStackNesting(1);
        return backStackRecord;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeIntArray(this.mOps);
        parcel.writeStringList(this.mFragmentWhos);
        parcel.writeIntArray(this.mOldMaxLifecycleStates);
        parcel.writeIntArray(this.mCurrentMaxLifecycleStates);
        parcel.writeInt(this.mTransition);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList(this.mSharedElementSourceNames);
        parcel.writeStringList(this.mSharedElementTargetNames);
        parcel.writeInt(this.mReorderingAllowed ? 1 : 0);
    }

    @NonNull
    public BackStackRecord instantiate(@NonNull FragmentManager fragmentManager, @NonNull Map<String, Fragment> map) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
        fillInBackStackRecord(backStackRecord);
        for (int i11 = 0; i11 < this.mFragmentWhos.size(); i11++) {
            String str = this.mFragmentWhos.get(i11);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment != null) {
                    backStackRecord.mOps.get(i11).mFragment = fragment;
                } else {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.mName + " failed due to missing saved state for Fragment (" + str + pn.j.f81007d);
                }
            }
        }
        return backStackRecord;
    }

    public BackStackRecordState(Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.mFragmentWhos = parcel.createStringArrayList();
        this.mOldMaxLifecycleStates = parcel.createIntArray();
        this.mCurrentMaxLifecycleStates = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.mBreadCrumbTitleText = (CharSequence) creator.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (CharSequence) creator.createFromParcel(parcel);
        this.mSharedElementSourceNames = parcel.createStringArrayList();
        this.mSharedElementTargetNames = parcel.createStringArrayList();
        this.mReorderingAllowed = parcel.readInt() != 0;
    }
}
