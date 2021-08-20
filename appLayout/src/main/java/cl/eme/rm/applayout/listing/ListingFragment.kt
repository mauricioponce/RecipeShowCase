package cl.eme.rm.applayout.listing

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cl.eme.rm.applayout.databinding.FragmentListingBinding
import cl.eme.rm.listing.presentation.ListingViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListingFragment : Fragment() {

    private val cViewModel: ListingViewModel by viewModel()

    private lateinit var binding: FragmentListingBinding

    private lateinit var adapter: RecipeAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListingBinding.inflate(layoutInflater)

        bindAdapter()

        //CoroutineScope(Dispatchers.IO).launch { init() }
        init()

        return binding.root
    }

    private fun bindAdapter() {
        adapter = RecipeAdapter()
        binding.recipesList.adapter = adapter
    }

    private fun init() {
        adapter.update(cViewModel.getRecipes())
    }
}