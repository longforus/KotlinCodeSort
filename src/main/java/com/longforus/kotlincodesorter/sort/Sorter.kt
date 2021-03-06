package com.longforus.kotlincodesorter.sort

import com.longforus.kotlincodesorter.sortstrategy.CommonSortStrategy
import com.longforus.kotlincodesorter.sortstrategy.ISortStrategy
import org.jetbrains.kotlin.psi.KtClassOrObject
import org.jetbrains.kotlin.psi.KtDeclaration


/**
 * Created by XQ Yang on 9/21/2018  5:06 PM.
 * Description :
 */

class Sorter(override val mPsiClass: KtClassOrObject) :ISorter{

    override fun getStrategy(declarations: List<KtDeclaration>): ISortStrategy {
        return CommonSortStrategy(declarations)
    }

}
