package com.vlingo.core.internal.lmtt;

import android.database.sqlite.SQLiteDatabase;

 enum LMTTItem$ChangeType$DBUpdateType$1
{
  void dbUpdate(LMTTItem paramLMTTItem, SQLiteDatabase paramSQLiteDatabase)
  {
    LMTTDBUtil.insertItem(paramLMTTItem, paramSQLiteDatabase);
  }
}

/* Location:           C:\Users\nigeluno\Desktop\APK2Java\tools\classes-dex2jar.jar
 * Qualified Name:     com.vlingo.core.internal.lmtt.LMTTItem.ChangeType.DBUpdateType.1
 * JD-Core Version:    0.6.0
 */