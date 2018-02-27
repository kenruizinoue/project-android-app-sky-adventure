package com.apps.yecotec.skyadventure.helpers;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by kenruizinoue on 2/27/18.
 */

public class VerticalSpaceItemDecorationHelper extends RecyclerView.ItemDecoration {
    private final int verticalSpaceHeight;

    public VerticalSpaceItemDecorationHelper(int verticalSpaceHeight) {
        this.verticalSpaceHeight = verticalSpaceHeight;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.bottom = verticalSpaceHeight;

        // Last item case
        if (parent.getChildAdapterPosition(view) == parent.getAdapter().getItemCount() - 1) {
            outRect.bottom = 50;
        }

        // First item case
        if(parent.getChildAdapterPosition(view) == 0) {
            outRect.top = 50;
        }
    }
}
