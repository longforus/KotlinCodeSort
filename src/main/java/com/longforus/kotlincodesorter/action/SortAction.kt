package com.longforus.kotlincodesorter.action

import com.longforus.kotlincodesorter.sort.ISorter
import com.longforus.kotlincodesorter.sort.Sorter
import org.jetbrains.kotlin.psi.KtClassOrObject


/**
 * Created by XQ Yang on 9/21/2018  5:06 PM.
 * Description :
 */

class SortAction : BaseSortAction() {


    override fun getSort(clazz: KtClassOrObject): ISorter  = Sorter(clazz)
}
