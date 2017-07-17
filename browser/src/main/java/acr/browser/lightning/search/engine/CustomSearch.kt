package acr.browser.lightning.search.engine

import com.baidu.browser.R

/**
 * A custom search engine.
 */
class CustomSearch(queryUrl: String) : BaseSearchEngine(
        "file:///android_asset/acr.browser.lightning.png",
        queryUrl,
        R.string.search_engine_custom
)
