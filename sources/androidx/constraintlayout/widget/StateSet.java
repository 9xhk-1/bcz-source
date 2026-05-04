package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class StateSet {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    int mDefaultState = -1;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private SparseArray<State> mStateList = new SparseArray<>();
    private ConstraintsChangedListener mConstraintsChangedListener = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class State {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        ArrayList<Variant> mVariants = new ArrayList<>();

        public State(Context context, XmlPullParser xmlPullParser) {
            this.mConstraintID = -1;
            this.mIsLayout = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.State_android_id) {
                    this.mId = obtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == R.styleable.State_constraints) {
                    this.mConstraintID = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        this.mIsLayout = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void add(Variant variant) {
            this.mVariants.add(variant);
        }

        public int findMatch(float f11, float f12) {
            for (int i11 = 0; i11 < this.mVariants.size(); i11++) {
                if (this.mVariants.get(i11).match(f11, f12)) {
                    return i11;
                }
            }
            return -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Variant {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        public Variant(Context context, XmlPullParser xmlPullParser) {
            this.mMinWidth = Float.NaN;
            this.mMinHeight = Float.NaN;
            this.mMaxWidth = Float.NaN;
            this.mMaxHeight = Float.NaN;
            this.mConstraintID = -1;
            this.mIsLayout = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.Variant_constraints) {
                    this.mConstraintID = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        this.mIsLayout = true;
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.mMaxHeight = obtainStyledAttributes.getDimension(index, this.mMaxHeight);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.mMinHeight = obtainStyledAttributes.getDimension(index, this.mMinHeight);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.mMaxWidth = obtainStyledAttributes.getDimension(index, this.mMaxWidth);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.mMinWidth = obtainStyledAttributes.getDimension(index, this.mMinWidth);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean match(float f11, float f12) {
            if (!Float.isNaN(this.mMinWidth) && f11 < this.mMinWidth) {
                return false;
            }
            if (!Float.isNaN(this.mMinHeight) && f12 < this.mMinHeight) {
                return false;
            }
            if (Float.isNaN(this.mMaxWidth) || f11 <= this.mMaxWidth) {
                return Float.isNaN(this.mMaxHeight) || f12 <= this.mMaxHeight;
            }
            return false;
        }
    }

    public StateSet(Context context, XmlPullParser xmlPullParser) {
        load(context, xmlPullParser);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void load(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == R.styleable.StateSet_defaultState) {
                this.mDefaultState = obtainStyledAttributes.getResourceId(index, this.mDefaultState);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            State state = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                state = new State(context, xmlPullParser);
                                this.mStateList.put(state.mId, state);
                                break;
                            } else {
                                break;
                            }
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                Variant variant = new Variant(context, xmlPullParser);
                                if (state != null) {
                                    state.add(variant);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e11);
        } catch (XmlPullParserException e12) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e12);
        }
    }

    public int convertToConstraintSet(int i11, int i12, float f11, float f12) {
        State state = this.mStateList.get(i12);
        if (state == null) {
            return i12;
        }
        if (f11 != -1.0f && f12 != -1.0f) {
            Iterator<Variant> it = state.mVariants.iterator();
            Variant variant = null;
            while (it.hasNext()) {
                Variant next = it.next();
                if (next.match(f11, f12)) {
                    if (i11 != next.mConstraintID) {
                        variant = next;
                    }
                }
            }
            return variant != null ? variant.mConstraintID : state.mConstraintID;
        }
        if (state.mConstraintID != i11) {
            Iterator<Variant> it2 = state.mVariants.iterator();
            while (it2.hasNext()) {
                if (i11 == it2.next().mConstraintID) {
                }
            }
            return state.mConstraintID;
        }
        return i11;
    }

    public boolean needsToChange(int i11, float f11, float f12) {
        int i12 = this.mCurrentStateId;
        if (i12 != i11) {
            return true;
        }
        State valueAt = i11 == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i12);
        int i13 = this.mCurrentConstraintNumber;
        return (i13 == -1 || !valueAt.mVariants.get(i13).match(f11, f12)) && this.mCurrentConstraintNumber != valueAt.findMatch(f11, f12);
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    public int stateGetConstraintID(int i11, int i12, int i13) {
        return updateConstraints(-1, i11, i12, i13);
    }

    public int updateConstraints(int i11, int i12, float f11, float f12) {
        int findMatch;
        if (i11 == i12) {
            State valueAt = i12 == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(this.mCurrentStateId);
            if (valueAt == null) {
                return -1;
            }
            return ((this.mCurrentConstraintNumber == -1 || !valueAt.mVariants.get(i11).match(f11, f12)) && i11 != (findMatch = valueAt.findMatch(f11, f12))) ? findMatch == -1 ? valueAt.mConstraintID : valueAt.mVariants.get(findMatch).mConstraintID : i11;
        }
        State state = this.mStateList.get(i12);
        if (state == null) {
            return -1;
        }
        int findMatch2 = state.findMatch(f11, f12);
        return findMatch2 == -1 ? state.mConstraintID : state.mVariants.get(findMatch2).mConstraintID;
    }
}
