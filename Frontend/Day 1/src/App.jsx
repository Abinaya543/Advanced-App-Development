import { BrowserRouter as Router,Route,Routes } from 'react-router-dom';
import './App.css';

import Login from './components/Login';

import Signup from './components/SigninSide';

function App() {
  return (
    <Provider store={store}>
    <Router>
   
    
      <Routes>
      
      <Route path='/login' element={<Login/>}/>
      
      <Route path='/SigninSide' element={<Signup/>}/>
      

     
      
      

      </Routes>
    </Router>
    </Provider>
  );
}



export default App
