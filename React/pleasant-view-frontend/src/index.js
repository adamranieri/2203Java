import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import BookRegistrationPage from './components/book-registration-page';
import BookViewerPage from './components/book-viewer-page';
import EmployeeLoginPage from './components/employee-login';
import PublisherPage from './components/publisher-viewer-page';


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <BrowserRouter>
      <Routes>
        <Route path='/bookviewer' element={<BookViewerPage/>}/>
        <Route path='/publisherviewer' element={<PublisherPage/>}/>
        <Route path='/bookcreator' element={<BookRegistrationPage/>}/>
        <Route path='/login' element={<EmployeeLoginPage/>}/>
        <Route path='/' element={<BookViewerPage/>}/>
      </Routes>
    </BrowserRouter>
  </React.StrictMode>
);


