
const Products = () => {
  const products = [
    { id: 1, imageUrl: "https://images.unsplash.com/photo-1646753522408-077ef9839300?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwcm9maWxlLXBhZ2V8NjZ8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", name: "Product 1", price: 149, discountedPrice: 199 },
    { id: 2, imageUrl: "https://images.unsplash.com/photo-1651950519238-15835722f8bb?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwcm9maWxlLXBhZ2V8Mjh8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", name: "Product 2", price: 149, discountedPrice: 199 },
    { id: 3, imageUrl: "https://images.unsplash.com/photo-1646753522408-077ef9839300?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwcm9maWxlLXBhZ2V8NjZ8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", name: "Product 1", price: 149, discountedPrice: 199 },
    { id: 4, imageUrl: "https://images.unsplash.com/photo-1651950519238-15835722f8bb?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwcm9maWxlLXBhZ2V8Mjh8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", name: "Product 2", price: 149, discountedPrice: 199 },
    { id: 5, imageUrl: "https://images.unsplash.com/photo-1646753522408-077ef9839300?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwcm9maWxlLXBhZ2V8NjZ8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", name: "Product 1", price: 149, discountedPrice: 199 },
    { id: 6, imageUrl: "https://images.unsplash.com/photo-1651950519238-15835722f8bb?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwcm9maWxlLXBhZ2V8Mjh8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", name: "Product 2", price: 149, discountedPrice: 199 },
    { id: 7, imageUrl: "https://images.unsplash.com/photo-1646753522408-077ef9839300?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwcm9maWxlLXBhZ2V8NjZ8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", name: "Product 1", price: 149, discountedPrice: 199 },
    { id: 8, imageUrl: "https://images.unsplash.com/photo-1651950519238-15835722f8bb?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwcm9maWxlLXBhZ2V8Mjh8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", name: "Product 2", price: 149, discountedPrice: 199 },
    { id: 9, imageUrl: "https://images.unsplash.com/photo-1646753522408-077ef9839300?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwcm9maWxlLXBhZ2V8NjZ8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", name: "Product 1", price: 149, discountedPrice: 199 },
    { id: 10, imageUrl: "https://images.unsplash.com/photo-1651950519238-15835722f8bb?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwcm9maWxlLXBhZ2V8Mjh8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", name: "Product 2", price: 149, discountedPrice: 199 },
    { id: 11, imageUrl: "https://images.unsplash.com/photo-1646753522408-077ef9839300?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwcm9maWxlLXBhZ2V8NjZ8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", name: "Product 1", price: 149, discountedPrice: 199 },
    { id: 12, imageUrl: "https://images.unsplash.com/photo-1651950519238-15835722f8bb?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwcm9maWxlLXBhZ2V8Mjh8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", name: "Product 2", price: 149, discountedPrice: 199 },
    
];
  return (
    <div className="text-center p-10">
            <section id="Projects"
                className="w-fit mx-auto grid grid-cols-1 lg:grid-cols-3 md:grid-cols-2 justify-items-center justify-center gap-y-20 gap-x-14 mt-10 mb-5">

                {/* Map over products array to render product cards */}
                {products.map((product) => (
                    <div key={product.id} className="w-72 bg-white shadow-md rounded-xl duration-500 hover:scale-105 hover:shadow-xl">
                        <a href="#">
                            <img src={product.imageUrl} alt="Product" className="h-80 w-72 object-cover rounded-t-xl" />
                            <div className="px-4 py-3 w-72">
                                <span className="text-gray-400 mr-3 uppercase text-xs">Brand</span>
                                <p className="text-lg font-bold text-black truncate block capitalize">{product.name}</p>
                                <div className="flex items-center">
                                    <p className="text-lg font-semibold text-black cursor-auto my-3">${product.price}</p>
                                    <del>
                                        <p className="text-sm text-gray-600 cursor-auto ml-2">${product.discountedPrice}</p>
                                    </del>
                                </div>
                                {/* "View Details" button */}
                                <div className="flex justify-center">
                                    <button className="bg-black hover:bg-grey text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline">
                                        View Details
                                    </button>
                                </div>
                            </div>
                        </a>
                    </div>
                ))}
            </section>
        </div>
  )
}

export default Products