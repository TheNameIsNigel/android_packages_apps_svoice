package com.vlingo.midas.gui.widgets;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.vlingo.core.internal.dialogmanager.vvs.WidgetActionListener;

class AddressBookWidget$ContactAdapter$1
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    this.this$1.this$0.retire();
    Intent localIntent = new Intent();
    localIntent.setAction("com.vlingo.core.internal.dialogmanager.ContactChoice");
    localIntent.putExtra("choice", this.val$position);
    AddressBookWidget.access$000(this.this$1.this$0).handleIntent(localIntent, null);
  }
}

/* Location:           C:\Users\nigeluno\Desktop\APK2Java\tools\classes-dex2jar.jar
 * Qualified Name:     com.vlingo.midas.gui.widgets.AddressBookWidget.ContactAdapter.1
 * JD-Core Version:    0.6.0
 */