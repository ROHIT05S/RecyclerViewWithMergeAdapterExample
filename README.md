# RecyclerViewWithMergeAdapterExample
Android Recycler View With Merge Adapter


Simple POC of Using Multiple Adapter in One Recycler View
Using Merge Adapter Concept .

Merge Adapter has been introduced so that we can design long screens with one parent container having recycler view.
U create multiple adapters and using the merge adapter syntax 

MergeAdapter(myDetailAdapter,  userVerticalAdapter,bannerAdapter)

U merge and design the UI.

These adapters will follow each other one by one.

As In the above example MyDetailAdapter will come first , then user vertical adapter and then banner adapter.

Some times we use Scroll View to design the lengthy screens. 
But the smootheness will be more if we divide the screens into different components
and create the adapter of each component.
The click event also can be handled in their own adapters itself.
