package androidx.databinding.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.databinding.ObservableList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
class ObservableListAdapter<T> extends BaseAdapter {
    private final Context mContext;
    private final int mDropDownResourceId;
    private final LayoutInflater mLayoutInflater;
    private List<T> mList;
    private ObservableList.OnListChangedCallback mListChangedCallback;
    private final int mResourceId;
    private final int mTextViewResourceId;

    public ObservableListAdapter(Context context, List<T> list, int i11, int i12, int i13) {
        this.mContext = context;
        this.mResourceId = i11;
        this.mDropDownResourceId = i12;
        this.mTextViewResourceId = i13;
        this.mLayoutInflater = i11 == 0 ? null : (LayoutInflater) context.getSystemService("layout_inflater");
        setList(list);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mList.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
        return getViewForResource(this.mDropDownResourceId, i11, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.mList.get(i11);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        return getViewForResource(this.mResourceId, i11, view, viewGroup);
    }

    public View getViewForResource(int i11, int i12, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = i11 == 0 ? new TextView(this.mContext) : this.mLayoutInflater.inflate(i11, viewGroup, false);
        }
        int i13 = this.mTextViewResourceId;
        TextView textView = (TextView) (i13 == 0 ? view : view.findViewById(i13));
        T t11 = this.mList.get(i12);
        textView.setText(t11 instanceof CharSequence ? (CharSequence) t11 : String.valueOf(t11));
        return view;
    }

    public void setList(List<T> list) {
        List<T> list2 = this.mList;
        if (list2 == list) {
            return;
        }
        if (list2 instanceof ObservableList) {
            ((ObservableList) list2).removeOnListChangedCallback(this.mListChangedCallback);
        }
        this.mList = list;
        if (list instanceof ObservableList) {
            if (this.mListChangedCallback == null) {
                this.mListChangedCallback = new ObservableList.OnListChangedCallback() { // from class: androidx.databinding.adapters.ObservableListAdapter.1
                    @Override // androidx.databinding.ObservableList.OnListChangedCallback
                    public void onChanged(ObservableList observableList) {
                        ObservableListAdapter.this.notifyDataSetChanged();
                    }

                    @Override // androidx.databinding.ObservableList.OnListChangedCallback
                    public void onItemRangeChanged(ObservableList observableList, int i11, int i12) {
                        ObservableListAdapter.this.notifyDataSetChanged();
                    }

                    @Override // androidx.databinding.ObservableList.OnListChangedCallback
                    public void onItemRangeInserted(ObservableList observableList, int i11, int i12) {
                        ObservableListAdapter.this.notifyDataSetChanged();
                    }

                    @Override // androidx.databinding.ObservableList.OnListChangedCallback
                    public void onItemRangeMoved(ObservableList observableList, int i11, int i12, int i13) {
                        ObservableListAdapter.this.notifyDataSetChanged();
                    }

                    @Override // androidx.databinding.ObservableList.OnListChangedCallback
                    public void onItemRangeRemoved(ObservableList observableList, int i11, int i12) {
                        ObservableListAdapter.this.notifyDataSetChanged();
                    }
                };
            }
            ((ObservableList) this.mList).addOnListChangedCallback(this.mListChangedCallback);
        }
        notifyDataSetChanged();
    }
}
