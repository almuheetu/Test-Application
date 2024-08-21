import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.Car
import com.example.testapplication.CarAdapter
import com.example.testapplication.databinding.FirstFragmentXmlBinding
import com.example.testapplication.carList


class FirstFragment : Fragment(), CarAdapter.ItemClickListener {
    private lateinit var adapter: CarAdapter
    private lateinit var binding: FirstFragmentXmlBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FirstFragmentXmlBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = binding.CarRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter = CarAdapter(carList, this)
        recyclerView.adapter = adapter

    }
    override fun onItemClick(car: Car) {

    }

}