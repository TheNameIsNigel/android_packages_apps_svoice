package com.vlingo.midas.settings.debug;

import android.preference.CheckBoxPreference;
import android.preference.Preference;

class DebugSettings$7
  implements PreferenceUpdateListener
{
  public void onPreferenceUpdated(Preference paramPreference)
  {
    this.this$0.enableFakeLatLong(((CheckBoxPreference)paramPreference).isChecked());
  }
}

/* Location:           C:\Users\nigeluno\Desktop\APK2Java\tools\classes-dex2jar.jar
 * Qualified Name:     com.vlingo.midas.settings.debug.DebugSettings.7
 * JD-Core Version:    0.6.0
 */